package config;

@org.aeonbits.owner.Config.Sources("classpath:config.properties")
public interface ConfigFile extends org.aeonbits.owner.Config {

    @Key("URL")
    String URL();

    @Key("URLL")
    String URLL();
}