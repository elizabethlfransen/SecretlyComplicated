package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.material.SCRock;
import io.github.elizabethlfransen.secretlycomplicated.material.SCRockBuilder;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

@RegisterClass
public class ModRocks {
    public static final SCRock graphite = new SCRockBuilder()
            .name("graphite")
            .color(0x808080)
            .build();
    public static final SCRock almandine = new SCRockBuilder()
            .name("almandine")
            .color(0xff0000)
            .build();
    public static final SCRock andradite = new SCRockBuilder()
            .name("andradite")
            .color(0x967800)
            .build();
    public static final SCRock banded_iron = new SCRockBuilder()
            .name("banded_iron")
            .color(0x915a5a)
            .build();
    public static final SCRock brown_limonite = new SCRockBuilder()
            .name("brown_limonite")
            .color(0xc86400)
            .build();
    public static final SCRock cassiterite = new SCRockBuilder()
            .name("cassiterite")
            .color(0xdcdcdc)
            .build();
    public static final SCRock chalcopyrite = new SCRockBuilder()
            .name("chalcopyrite")
            .color(0xa07828)
            .build();
    @NoReg
    private static final Set<SCRock> values = Arrays.stream(ModRocks.class.getDeclaredFields())
            .filter(f -> f.getType() == SCRock.class)
            .map(f -> {
                try {
                    return (SCRock) f.get(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toUnmodifiableSet());


    public static Set<SCRock> getValues() {
        return ModRocks.values;
    }

}
