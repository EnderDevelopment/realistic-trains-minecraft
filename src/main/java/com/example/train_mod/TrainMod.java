package com.example.train_mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class TrainMod implements ModInitializer {
    public static final String MOD_ID = "train_mod";

    public static final EntityType<TrainEntity> TRAIN_ENTITY_TYPE = EntityType.Builder.of(TrainEntity::new, MobCategory.MISC)
            .sized(2.0f, 2.0f)
            .build("train_entity");

    public static final Block RAIL_BLOCK = new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.0f));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ENTITY_TYPE, new ResourceLocation(MOD_ID, "train_entity"), TRAIN_ENTITY_TYPE);
        Registry.register(Registry.BLOCK, new ResourceLocation(MOD_ID, "rail_block"), RAIL_BLOCK);
    }
}