@Configuration
public class AppConfig {
    
    @Bean
    public RmiServiceExporter RmiServiceExporter(){
        RmiServiceExporter exporter = new RmiServiceExporter();
        exporter.setServiceName("CalculatorService");
        exporter.setServiceInterface(CalculatorService.class);
        exporter.setService(new CalculatorServiceImpl());
        return exporter;
    }
}
