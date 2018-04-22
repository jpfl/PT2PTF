package mehtadone.processor;

import mehtadone.output.ApplicationSettings;

import java.util.Properties;

public class SkipSpecialCaseProcessor implements SpecialCaseProcessor {

    @Override
    public void process(final String key, final Properties pairsProperties, final ApplicationSettings applicationSettings) {
        // Just skip processing if unknown special case key was encountered
    }

}
