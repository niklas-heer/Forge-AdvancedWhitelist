package net.minecraft.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Random;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockGlass extends BlockBreakable {

   public BlockGlass(int p_i3951_1_, int p_i3951_2_, Material p_i3951_3_, boolean p_i3951_4_) {
      super(p_i3951_1_, p_i3951_2_, p_i3951_3_, p_i3951_4_);
      this.func_71849_a(CreativeTabs.field_78030_b);
   }

   public int func_71925_a(Random p_71925_1_) {
      return 0;
   }

   @SideOnly(Side.CLIENT)
   public int func_71856_s_() {
      return 0;
   }

   public boolean func_71926_d() {
      return false;
   }

   public boolean func_71886_c() {
      return false;
   }

   protected boolean func_71906_q_() {
      return true;
   }
}
