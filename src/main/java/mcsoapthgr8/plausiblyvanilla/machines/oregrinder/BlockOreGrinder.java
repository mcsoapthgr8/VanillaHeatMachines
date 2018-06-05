package mcsoapthgr8.plausiblyvanilla.machines.oregrinder;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;

import javax.annotation.Nullable;

public class BlockOreGrinder extends BlockContainer {

    public BlockOreGrinder(String name) {
        super(Material.ROCK);
        this.setHarvestLevel("pickaxe", 0);
        this.setHardness(1.5F);
        this.setResistance(10.0F);
        this.setSoundType(SoundType.STONE);
    }



    @Nullable
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return null;
    }
}
