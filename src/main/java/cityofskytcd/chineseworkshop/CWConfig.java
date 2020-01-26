package cityofskytcd.chineseworkshop;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import com.google.common.base.Predicates;

import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;

public class CWConfig {

    static final ForgeConfigSpec spec;

    public static ConfigValue<List<? extends String>> allowedClasses;
    public static ConfigValue<List<? extends String>> allowedMods;

    static {
        final Pair<CWConfig, ForgeConfigSpec> specPair = new ForgeConfigSpec.Builder().configure(CWConfig::new);
        spec = specPair.getRight();
    }

    private CWConfig(ForgeConfigSpec.Builder builder) {
        builder.push("adjustmentStick");

        allowedMods = builder.defineList("allowedMods", () -> Collections.singletonList(CW.MODID), Predicates.alwaysTrue());
        allowedClasses = builder.defineList("allowedClasses", () -> {
            /* off */
            return Arrays.asList(
                    "net.minecraft.block.HugeMushroomBlock",
                    "net.minecraft.block.FenceBlock",
                    "net.minecraft.block.WallBlock",
                    "net.minecraft.block.PaneBlock",
                    "net.minecraft.block.StainedGlassPaneBlock"
            );
            /* on */
        }, Predicates.alwaysTrue());

        builder.pop();
    }

}
