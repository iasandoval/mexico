package mx.com.nacho.mexico.batch;

import mx.com.nacho.mexico.batch.domain.CLocalidad;
import mx.com.nacho.mexico.batch.listener.CLocalidadNotificationListener;
import mx.com.nacho.mexico.batch.mapper.CLocalidadFieldSetMapper;
import mx.com.nacho.mexico.batch.processor.CLocalidadItemProcessor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.database.builder.JdbcBatchItemWriterBuilder;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class MexicoBatchConfiguration {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public FlatFileItemReader<CLocalidad> reader() {

        DelimitedLineTokenizer customLineTokenizer = new DelimitedLineTokenizer() {
            @Override
            protected boolean isQuoteCharacter(char c) {
                return false;
            }
        };
        customLineTokenizer.setNames(new String[]{"mapa", "cve_ent", "nom_ent", "nom_abr", "cve_mun", "nom_mun",
                "cve_loc", "nom_loc", "ámbito", "latitud", "longitud", "lat_decimal", "lon_decimal", "altitud",
                "cve_carta", "pob_total", "pob_masculina", "pob_femenina", "total de viviendas habitadas"});


        return new FlatFileItemReaderBuilder<CLocalidad>()
                .name("localidadItemReader")
                .resource(new ClassPathResource("catun_localidad.csv"))
                .linesToSkip(1)
                .lineTokenizer(customLineTokenizer)
                .fieldSetMapper(new CLocalidadFieldSetMapper())
                .encoding("Cp1252")
                .build();
    }

    @Bean
    public CLocalidadItemProcessor processor() {
        return new CLocalidadItemProcessor();
    }

    @Bean
    public JdbcBatchItemWriter<CLocalidad> writer(DataSource dataSource) {
        return new JdbcBatchItemWriterBuilder<CLocalidad>()
                .itemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>())
                .sql("INSERT INTO catun_localidad (mapa, cve_ent, nom_ent, nom_abr, cve_mun, nom_mun, cve_loc, nom_loc, " +
                        "ambito, latitud, longitud, lat_decimal, lon_decimal, altitud, cve_carta, pob_total, " +
                        "pob_masculina, pob_femenina, total_viviendas) VALUES (:mapa, :claveEntidad, :nombreEntidad, :entidadAbreviada, " +
                        ":claveMunicipio, :nombreMunicipio, :claveLocalidad, :nombreLocalidad, :ambito, :latitudDMS, :longitudDMS, :latitudDecimal, " +
                        ":longitudDecimal, :altitud, :claveCarta, :poblacionTotal, :poblacionMasculina, :poblacionFemenina, :totalViviendas)")
                .dataSource(dataSource)
                .build();
    }

    @Bean
    public Job importUserJob(CLocalidadNotificationListener listener, Step step1) {
        return jobBuilderFactory.get("importLocalidadJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1)
                .end()
                .build();
    }

    @Bean
    public Step step1(JdbcBatchItemWriter<CLocalidad> writer) {
        return stepBuilderFactory.get("step1")
                .<CLocalidad, CLocalidad> chunk(10)
                .reader(reader())
                .processor(processor())
                .writer(writer)
                .build();
    }


    /*@Bean
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
    }*/
}
