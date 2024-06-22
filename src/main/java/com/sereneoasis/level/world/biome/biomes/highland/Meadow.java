package com.sereneoasis.level.world.biome.biomes.highland;

import com.sereneoasis.level.world.biome.BiomeLayers;
import com.sereneoasis.level.world.biome.BiomeRepresentation;
import com.sereneoasis.level.world.biome.biomefeatures.FloraBiome;
import com.sereneoasis.level.world.biome.biomefeatures.FloraBiomeUtils;
import com.sereneoasis.level.world.biome.biomefeatures.TreeBiome;
import com.sereneoasis.level.world.biome.biomes.BiomeCategories;
import org.bukkit.Material;
import org.bukkit.TreeType;
import org.bukkit.block.Biome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Meadow extends BiomeRepresentation implements TreeBiome, FloraBiome {

    private static final HashMap<BiomeLayers, List<Material>> layers = new HashMap<>() {{
        put(BiomeLayers.SURFACE, List.of(Material.GRASS_BLOCK));
        put(BiomeLayers.PRIMARY, List.of(Material.DIRT));
        put(BiomeLayers.SECONDARY, Arrays.asList(Material.COAL_ORE, Material.IRON_ORE, Material.REDSTONE_ORE, Material.LAPIS_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE));
        put(BiomeLayers.BASE, List.of(Material.BEDROCK));
    }};
    public Meadow() {
        super(Biome.MEADOW, "Meadow", layers, 0.3, 0.5, 0.1, BiomeCategories.HIGH);
    }

    @Override
    public TreeType[] getTreeType() {
        return new TreeType[]{TreeType.BIG_TREE};
    }

    @Override
    public HashMap<Material, Integer> getFlora() {
        return FloraBiomeUtils.getFlowers(10);
    }
}
