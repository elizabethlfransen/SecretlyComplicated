package io.github.elizabethlfransen.secretlycomplicated.register;

import io.github.elizabethlfransen.secretlycomplicated.material.SCOre;
import io.github.elizabethlfransen.secretlycomplicated.material.SCOreBuilder;
import io.github.noeppi_noeppi.libx.annotation.registration.NoReg;
import io.github.noeppi_noeppi.libx.annotation.registration.RegisterClass;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static io.github.elizabethlfransen.secretlycomplicated.materialform.CommonMaterialFormFactories.ORES;

@RegisterClass
public class ModOres {
    public static final SCOre graphite = new SCOreBuilder()
            .withForms(ORES)
            .name("graphite")
            .color(0x808080)
            .build();
    public static final SCOre almandine = new SCOreBuilder()
            .withForms(ORES)
            .name("almandine")
            .color(0xff0000)
            .build();
    public static final SCOre andradite = new SCOreBuilder()
            .withForms(ORES)
            .name("andradite")
            .color(0x967800)
            .build();
    public static final SCOre banded_iron = new SCOreBuilder()
            .withForms(ORES)
            .name("banded_iron")
            .color(0x915a5a)
            .build();
    public static final SCOre brown_limonite = new SCOreBuilder()
            .withForms(ORES)
            .name("brown_limonite")
            .color(0xc86400)
            .build();
    public static final SCOre cassiterite = new SCOreBuilder()
            .withForms(ORES)
            .name("cassiterite")
            .color(0xdcdcdc)
            .build();
    public static final SCOre chalcopyrite = new SCOreBuilder()
            .withForms(ORES)
            .name("chalcopyrite")
            .color(0xa07828)
            .build();
    public static final SCOre cobaltite = new SCOreBuilder()
            .withForms(ORES)
            .name("cobaltite")
            .color(0x5050fa)
            .build();
    public static final SCOre cooperite = new SCOreBuilder()
            .withForms(ORES)
            .name("cooperite")
            .color(0xffffc8)
            .build();
    public static final SCOre galena = new SCOreBuilder()
            .withForms(ORES)
            .name("galena")
            .color(0x643c64)
            .build();
    public static final SCOre garnierite = new SCOreBuilder()
            .withForms(ORES)
            .name("garnierite")
            .color(0x32c846)
            .build();
    public static final SCOre grossular = new SCOreBuilder()
            .withForms(ORES)
            .name("grossular")
            .color(0xc86400)
            .build();
    public static final SCOre ilmenite = new SCOreBuilder()
            .withForms(ORES)
            .name("ilmenite")
            .color(0x463732)
            .build();
    public static final SCOre rutile = new SCOreBuilder()
            .withForms(ORES)
            .name("rutile")
            .color(0xd40d5c)
            .build();
    public static final SCOre magnesite = new SCOreBuilder()
            .withForms(ORES)
            .name("magnesite")
            .color(0xfafab4)
            .build();
    public static final SCOre molybdenite = new SCOreBuilder()
            .withForms(ORES)
            .name("molybdenite")
            .color(0x919191)
            .build();
    public static final SCOre phosphate = new SCOreBuilder()
            .withForms(ORES)
            .name("phosphate")
            .color(0xffff00)
            .build();
    public static final SCOre pyrite = new SCOreBuilder()
            .withForms(ORES)
            .name("pyrite")
            .color(0x967828)
            .build();
    public static final SCOre pyrolusite = new SCOreBuilder()
            .withForms(ORES)
            .name("pyrolusite")
            .color(0x9696aa)
            .build();
    public static final SCOre pyrope = new SCOreBuilder()
            .withForms(ORES)
            .name("pyrope")
            .color(0x783264)
            .build();
    public static final SCOre saltpeter = new SCOreBuilder()
            .withForms(ORES)
            .name("saltpeter")
            .color(0xe6e6e6)
            .build();
    public static final SCOre scheelite = new SCOreBuilder()
            .withForms(ORES)
            .name("scheelite")
            .color(0xc88c14)
            .build();
    public static final SCOre spessartine = new SCOreBuilder()
            .withForms(ORES)
            .name("spessartine")
            .color(0xff6464)
            .build();
    public static final SCOre sphalerite = new SCOreBuilder()
            .withForms(ORES)
            .name("sphalerite")
            .color(0xffffff)
            .build();
    public static final SCOre stibnite = new SCOreBuilder()
            .withForms(ORES)
            .name("stibnite")
            .color(0x464646)
            .build();
    public static final SCOre tetrahedrite = new SCOreBuilder()
            .withForms(ORES)
            .name("tetrahedrite")
            .color(0xc82000)
            .build();
    public static final SCOre tungstate = new SCOreBuilder()
            .withForms(ORES)
            .name("tungstate")
            .color(0x373223)
            .build();
    public static final SCOre uraninite = new SCOreBuilder()
            .withForms(ORES)
            .name("uraninite")
            .color(0x232323)
            .build();
    public static final SCOre uvarovite = new SCOreBuilder()
            .withForms(ORES)
            .name("uvarovite")
            .color(0xb4ffb4)
            .build();
    public static final SCOre wulfenite = new SCOreBuilder()
            .withForms(ORES)
            .name("wulfenite")
            .color(0xff8000)
            .build();
    public static final SCOre yellow_limonite = new SCOreBuilder()
            .withForms(ORES)
            .name("yellow_limonite")
            .color(0xc8c800)
            .build();
    public static final SCOre vanadium_magnetite = new SCOreBuilder()
            .withForms(ORES)
            .name("vanadium_magnetite")
            .color(0x23233c)
            .build();
    public static final SCOre bastnasite = new SCOreBuilder()
            .withForms(ORES)
            .name("bastnasite")
            .color(0xc86e2d)
            .build();
    public static final SCOre pentlandite = new SCOreBuilder()
            .withForms(ORES)
            .name("pentlandite")
            .color(0xa59605)
            .build();
    public static final SCOre spodumene = new SCOreBuilder()
            .withForms(ORES)
            .name("spodumene")
            .color(0xbeaaaa)
            .build();
    public static final SCOre tantalite = new SCOreBuilder()
            .withForms(ORES)
            .name("tantalite")
            .color(0x915028)
            .build();
    public static final SCOre lepidolite = new SCOreBuilder()
            .withForms(ORES)
            .name("lepidolite")
            .color(0xf0328c)
            .build();
    public static final SCOre glauconite = new SCOreBuilder()
            .withForms(ORES)
            .name("glauconite")
            .color(0x82b43c)
            .build();
    public static final SCOre bentonite = new SCOreBuilder()
            .withForms(ORES)
            .name("bentonite")
            .color(0xf5d7d2)
            .build();
    public static final SCOre pitchblende = new SCOreBuilder()
            .withForms(ORES)
            .name("pitchblende")
            .color(0xc8d200)
            .build();
    public static final SCOre malachite = new SCOreBuilder()
            .withForms(ORES)
            .name("malachite")
            .color(0x055f05)
            .build();
    public static final SCOre barite = new SCOreBuilder()
            .withForms(ORES)
            .name("barite")
            .color(0xe6ebff)
            .build();
    public static final SCOre lazurite = new SCOreBuilder()
            .withForms(ORES)
            .name("lazurite")
            .color(0x6478ff)
            .build();
    public static final SCOre cinnabar = new SCOreBuilder()
            .withForms(ORES)
            .name("cinnabar")
            .color(0x960000)
            .build();
    public static final SCOre quartzite = new SCOreBuilder()
            .withForms(ORES)
            .name("quartzite")
            .color(0xe6cdcd)
            .build();
    public static final SCOre lignite_coal = new SCOreBuilder()
            .withForms(ORES)
            .name("lignite_coal")
            .color(0x644646)
            .build();
    public static final SCOre rock_salt = new SCOreBuilder()
            .withForms(ORES)
            .name("rock_salt")
            .color(0xf0c8c8)
            .build();
    public static final SCOre bauxite = new SCOreBuilder()
            .withForms(ORES)
            .name("bauxite")
            .color(0xc86400)
            .build();
    public static final SCOre oil_shale = new SCOreBuilder()
            .withForms(ORES)
            .name("oil_shale")
            .color(0x32323c)
            .build();
    public static final SCOre oilsands = new SCOreBuilder()
            .withForms(ORES)
            .name("oilsands")
            .color(0x0a0a0a)
            .build();
    @NoReg
    private static final Set<SCOre> values = Arrays.stream(ModOres.class.getDeclaredFields())
            .filter(f -> f.getType() == SCOre.class)
            .map(f -> {
                try {
                    return (SCOre) f.get(null);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            })
            .collect(Collectors.toUnmodifiableSet());


    public static Set<SCOre> getValues() {
        return ModOres.values;
    }

}
