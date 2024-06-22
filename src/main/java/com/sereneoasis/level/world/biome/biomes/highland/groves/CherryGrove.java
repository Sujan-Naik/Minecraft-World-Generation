package com.sereneoasis.level.world.biome.biomes.highland.groves;

import com.sereneoasis.level.world.biome.BiomeLayers;
import com.sereneoasis.level.world.biome.BiomeRepresentation;
import com.sereneoasis.level.world.biome.biomefeatures.FloraBiome;
import com.sereneoasis.level.world.biome.biomefeatures.FloraBiomeUtils;
import com.sereneoasis.level.world.biome.biomefeatures.TreeBiome;
import com.sereneoasis.level.world.biome.biomes.BiomeCategories;
import org.bukkit.Material;
import org.bukkit.TreeType;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CherryGrove extends BiomeRepresentation implements TreeBiome, FloraBiome {

    private static final HashMap<BiomeLayers, List<Material>> layers = new HashMap<>() {{
        put(BiomeLayers.SURFACE, List.of(Material.GRASS_BLOCK));
        put(BiomeLayers.PRIMARY, List.of(Material.DIRT));
        put(BiomeLayers.SECONDARY, Arrays.asList(Material.COAL_ORE, Material.IRON_ORE, Material.REDSTONE_ORE, Material.LAPIS_ORE, Material.GOLD_ORE, Material.DIAMOND_ORE));
        put(BiomeLayers.BASE, List.of(Material.BEDROCK));
    }};
    public CherryGrove() {
        super(org.bukkit.block.Biome.CHERRY_GROVE, "Cherry Grove", layers, 0.3, 0.5, 0.1, BiomeCategories.HIGH);
    }

    @Override
    public TreeType[] getTreeType() {
        return new TreeType[]{TreeType.CHERRY};
    }

    @Override
    public HashMap<Material, Integer> getFlora() {
        HashMap<Material, Integer>flora = new HashMap<>();
        flora.putAll(FloraBiomeUtils.getFlowers(10));
        flora.put(Material.SHORT_GRASS, 10);
        flora.put(Material.POPPY, 5);
        flora.put(Material.PINK_PETALS, 30);
        return flora;
    }
}
