package pt2ptf.processor;

import pt2ptf.output.ApplicationSettings;

import java.util.Properties;

public class HiddenPairsSpecialCaseProcessor implements SpecialCaseProcessor {

    @Override
    public void process(final String key, final Properties pairsProperties, final ApplicationSettings applicationSettings) {
        applicationSettings.getSectionToFill("special-cases", key).put("HiddenCoins", pairsProperties.getProperty(key));
    }

}
