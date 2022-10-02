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
    public static final SCRock cobaltite = new SCRockBuilder()
            .name("cobaltite")
            .color(0x5050fa)
            .build();
    public static final SCRock cooperite = new SCRockBuilder()
            .name("cooperite")
            .color(0xffffc8)
            .build();
    public static final SCRock galena = new SCRockBuilder()
            .name("galena")
            .color(0x643c64)
            .build();
    public static final SCRock garnierite = new SCRockBuilder()
            .name("garnierite")
            .color(0x32c846)
            .build();
    public static final SCRock grossular = new SCRockBuilder()
            .name("grossular")
            .color(0xc86400)
            .build();
    public static final SCRock ilmenite = new SCRockBuilder()
            .name("ilmenite")
            .color(0x463732)
            .build();
    public static final SCRock rutile = new SCRockBuilder()
            .name("rutile")
            .color(0xd40d5c)
            .build();
    public static final SCRock magnesite = new SCRockBuilder()
            .name("magnesite")
            .color(0xfafab4)
            .build();
    public static final SCRock molybdenite = new SCRockBuilder()
            .name("molybdenite")
            .color(0x919191)
            .build();
    public static final SCRock phosphate = new SCRockBuilder()
            .name("phosphate")
            .color(0xffff00)
            .build();
    public static final SCRock pyrite = new SCRockBuilder()
            .name("pyrite")
            .color(0x967828)
            .build();
    public static final SCRock pyrolusite = new SCRockBuilder()
            .name("pyrolusite")
            .color(0x9696aa)
            .build();
    public static final SCRock pyrope = new SCRockBuilder()
            .name("pyrope")
            .color(0x783264)
            .build();
    public static final SCRock saltpeter = new SCRockBuilder()
            .name("saltpeter")
            .color(0xe6e6e6)
            .build();
    public static final SCRock scheelite = new SCRockBuilder()
            .name("scheelite")
            .color(0xc88c14)
            .build();
    public static final SCRock spessartine = new SCRockBuilder()
            .name("spessartine")
            .color(0xff6464)
            .build();
    public static final SCRock sphalerite = new SCRockBuilder()
            .name("sphalerite")
            .color(0xffffff)
            .build();
    public static final SCRock stibnite = new SCRockBuilder()
            .name("stibnite")
            .color(0x464646)
            .build();
    public static final SCRock tetrahedrite = new SCRockBuilder()
            .name("tetrahedrite")
            .color(0xc82000)
            .build();
    public static final SCRock tungstate = new SCRockBuilder()
            .name("tungstate")
            .color(0x373223)
            .build();
    public static final SCRock uraninite = new SCRockBuilder()
            .name("uraninite")
            .color(0x232323)
            .build();
    public static final SCRock uvarovite = new SCRockBuilder()
            .name("uvarovite")
            .color(0xb4ffb4)
            .build();
    public static final SCRock wulfenite = new SCRockBuilder()
            .name("wulfenite")
            .color(0xff8000)
            .build();
    public static final SCRock yellow_limonite = new SCRockBuilder()
            .name("yellow_limonite")
            .color(0xc8c800)
            .build();
    public static final SCRock vanadium_magnetite = new SCRockBuilder()
            .name("vanadium_magnetite")
            .color(0x23233c)
            .build();
    public static final SCRock bastnasite = new SCRockBuilder()
            .name("bastnasite")
            .color(0xc86e2d)
            .build();
    public static final SCRock pentlandite = new SCRockBuilder()
            .name("pentlandite")
            .color(0xa59605)
            .build();
    public static final SCRock spodumene = new SCRockBuilder()
            .name("spodumene")
            .color(0xbeaaaa)
            .build();
    public static final SCRock tantalite = new SCRockBuilder()
            .name("tantalite")
            .color(0x915028)
            .build();
    public static final SCRock lepidolite = new SCRockBuilder()
            .name("lepidolite")
            .color(0xf0328c)
            .build();
    public static final SCRock glauconite = new SCRockBuilder()
            .name("glauconite")
            .color(0x82b43c)
            .build();
    public static final SCRock bentonite = new SCRockBuilder()
            .name("bentonite")
            .color(0xf5d7d2)
            .build();
    public static final SCRock pitchblende = new SCRockBuilder()
            .name("pitchblende")
            .color(0xc8d200)
            .build();
    public static final SCRock malachite = new SCRockBuilder()
            .name("malachite")
            .color(0x055f05)
            .build();
    public static final SCRock barite = new SCRockBuilder()
            .name("barite")
            .color(0xe6ebff)
            .build();
    public static final SCRock lazurite = new SCRockBuilder()
            .name("lazurite")
            .color(0x6478ff)
            .build();
    public static final SCRock cinnabar = new SCRockBuilder()
            .name("cinnabar")
            .color(0x960000)
            .build();
    public static final SCRock quartzite = new SCRockBuilder()
            .name("quartzite")
            .color(0xe6cdcd)
            .build();
    public static final SCRock lignite_coal = new SCRockBuilder()
            .name("lignite_coal")
            .color(0x644646)
            .build();
    public static final SCRock rock_salt = new SCRockBuilder()
            .name("rock_salt")
            .color(0xf0c8c8)
            .build();
    public static final SCRock bauxite = new SCRockBuilder()
            .name("bauxite")
            .color(0xc86400)
            .build();
    public static final SCRock oil_shale = new SCRockBuilder()
            .name("oil_shale")
            .color(0x32323c)
            .build();
    public static final SCRock oilsands = new SCRockBuilder()
            .name("oilsands")
            .color(0x0a0a0a)
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
