package com.example.train_mod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.RailBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RailBlock extends Block {
    public RailBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).strength(2.0f));
    }

    @Override
    public boolean isRail(BlockState state) {
        return true;
    }
}