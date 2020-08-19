package mx.com.nacho.mexico.batch;

import mx.com.nacho.mexico.batch.domain.Estado;
import mx.com.nacho.mexico.batch.listener.EstadoJobCompletionNotificationListener;
import mx.com.nacho.mexico.batch.processor.EstadoItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.database.builder.JdbcCursorItemReaderBuilder;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.builder.FlatFileItemWriterBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class MexicoBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public ItemReader<Estado> reader(DataSource dataSource) {
        return new JdbcCursorItemReaderBuilder<Estado>()
                .name("estadoItemReader")
                .dataSource(dataSource)
                .sql("SELECT id, clave, nombre, abrev FROM estados")
                .rowMapper(new BeanPropertyRowMapper<>(Estado.class))
                .build();
    }

    @Bean
    public EstadoItemProcessor processor() {
        return new EstadoItemProcessor();
    }

    @Bean
    public FlatFileItemWriter<Estado> writer(DataSource dataSource) {
        return new FlatFileItemWriterBuilder<Estado>()
                .name("personItemReader")
                .resource(new FileSystemResource("estados.csv"))
                .delimited()
                .names(new String[]{"id", "clave", "nombre", "abrev"})
                .build();
    }

    @Bean
    public Job importEstadoJob(EstadoJobCompletionNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importEstadoJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(ItemReader<Estado> reader, FlatFileItemWriter<Estado> writer) {
        return stepBuilderFactory.get("step1")
                .<Estado, Estado> chunk(10)
                .reader(reader)
                .processor(processor())
                .writer(writer)
                .build();
    }
}
