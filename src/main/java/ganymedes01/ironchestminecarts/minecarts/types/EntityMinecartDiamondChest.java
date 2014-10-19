package ganymedes01.ironchestminecarts.minecarts.types;

import ganymedes01.ironchestminecarts.minecarts.EntityMinecartIronChestAbstract;
import net.minecraft.world.World;
import cpw.mods.ironchest.IronChestType;

public class EntityMinecartDiamondChest extends EntityMinecartIronChestAbstract {

    public EntityMinecartDiamondChest(World world)
    {
        super(world);
    }

    public EntityMinecartDiamondChest(World world, double x, double y, double z)
    {
        super(world, x, y, z);
    }

    @Override
    public IronChestType type()
    {
        return IronChestType.DIAMOND;
    }

}
