package org.home.spring.annotation_configuration.disk;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Nonnull;

import static org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE;

@Component
@Scope(value = SCOPE_PROTOTYPE)
@Qualifier("chineseSongs")
public class ChineseSongs implements CompactDisk {
    @Override
    @Nonnull
    public String getTitle() {
        return "Chinese Songs";
    }

    @Override
    @Nonnull
    public String getArtist() {
        return "Chinese artist";
    }
}
