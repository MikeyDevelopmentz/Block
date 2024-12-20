package mikey.block;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.block.BlockExplodeEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class ExplosionListener implements Listener {
    private final List<Material> preventDropMaterials = Arrays.asList(
            Material.STONE,
            Material.COBBLESTONE,
            Material.GRASS_BLOCK,
            Material.DIRT
    );

    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
        handleExplosion(event.blockList().iterator());
    }

    @EventHandler
    public void onBlockExplode(BlockExplodeEvent event) {
        handleExplosion(event.blockList().iterator());
    }

    private void handleExplosion(Iterator<Block> blocks) {
        while (blocks.hasNext()) {
            Block block = blocks.next();
            if (preventDropMaterials.contains(block.getType())) {
                block.setType(Material.AIR);
                blocks.remove();
            }
        }
    }
}