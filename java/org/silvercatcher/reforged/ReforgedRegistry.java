package org.silvercatcher.reforged;

import java.util.ArrayList;
import java.util.List;

import org.silvercatcher.reforged.items.ItemExtension;
import org.silvercatcher.reforged.items.others.ItemArrowBundle;
import org.silvercatcher.reforged.items.others.ItemBulletMusket;
import org.silvercatcher.reforged.items.weapons.ItemBattleAxe;
import org.silvercatcher.reforged.items.weapons.ItemMusketWithBayonet;
import org.silvercatcher.reforged.items.weapons.ItemBoomerang;
import org.silvercatcher.reforged.items.weapons.ItemHolyCross;
import org.silvercatcher.reforged.items.weapons.ItemFireRod;
import org.silvercatcher.reforged.items.weapons.ItemJavelin;
import org.silvercatcher.reforged.items.weapons.ItemKnife;
import org.silvercatcher.reforged.items.weapons.ItemMusket;
import org.silvercatcher.reforged.items.weapons.ItemNestOfBees;
import org.silvercatcher.reforged.items.weapons.ItemSaber;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ReforgedRegistry {
	
	//public static ToolMaterial COPPER = EnumHelper.addToolMaterial("COPPER", 2, 200, 5.0F, 1.5F, 10);

	public static Item ARROW_BUNDLE;
	
	public static Item GUN_STOCK;
	public static Item BLUNDERBUSS_BARREL;
	public static Item MUSKET_BARREL;
	
	public static Item BLUNDERBUSS;
	public static Item MUSKET;
	public static Item WOODEN_BAYONET_MUSKET;
	public static Item STONE_BAYONET_MUSKET;
	public static Item IRON_BAYONET_MUSKET;
	public static Item GOLDEN_BAYONET_MUSKET;
	public static Item DIAMOND_BAYONET_MUSKET;
	
	public static Item MUSKET_BULLET;
	public static Item BLUNDERBUSS_SHOT;
	
	public static Item NEST_OF_BEES;

	public static Item HOLY_CROSS;
	
	public static Item FIREROD;
	
	public static Item WOODEN_BATTLE_AXE;
	public static Item STONE_BATTLE_AXE;
	public static Item IRON_BATTLE_AXE;
	public static Item GOLDEN_BATTLE_AXE;
	public static Item DIAMOND_BATTLE_AXE;
	
	public static Item WOODEN_BOOMERANG;
	public static Item STONE_BOOMERANG;
	public static Item IRON_BOOMERANG;
	public static Item GOLDEN_BOOMERANG;
	public static Item DIAMOND_BOOMERANG;
	
	public static Item WOODEN_SABER;
	public static Item STONE_SABER;
	public static Item IRON_SABER;
	public static Item GOLDEN_SABER;
	public static Item DIAMOND_SABER;
	
	public static Item WOODEN_KNIFE;
	public static Item STONE_KNIFE;
	public static Item IRON_KNIFE;
	public static Item GOLDEN_KNIFE;
	public static Item DIAMOND_KNIFE;
	
	public static Item JAVELIN;	

	
	public static List<Item> registrationList = new ArrayList<Item>();
	
	public static void createItems() {
		
		registrationList.add(ARROW_BUNDLE = new ItemArrowBundle());
		
		registrationList.add(NEST_OF_BEES = new ItemNestOfBees());

		registrationList.add(HOLY_CROSS = new ItemHolyCross());
		
		registrationList.add(FIREROD = new ItemFireRod());
		
		registrationList.add(MUSKET_BARREL = 
				new Item().setUnlocalizedName("musket_barrel").setCreativeTab(ReforgedMod.tabReforged));
		registrationList.add(BLUNDERBUSS_BARREL = 
				new Item().setUnlocalizedName("blunderbuss_barrel").setCreativeTab(ReforgedMod.tabReforged));
		registrationList.add(GUN_STOCK = 
				new Item().setUnlocalizedName("gun_stock").setCreativeTab(ReforgedMod.tabReforged));
		
		registrationList.add(MUSKET = new ItemMusket());
		registrationList.add(WOODEN_BAYONET_MUSKET = new ItemMusketWithBayonet(ToolMaterial.WOOD));
		registrationList.add(STONE_BAYONET_MUSKET = new ItemMusketWithBayonet(ToolMaterial.STONE));
		registrationList.add(IRON_BAYONET_MUSKET = new ItemMusketWithBayonet(ToolMaterial.IRON));
		registrationList.add(GOLDEN_BAYONET_MUSKET = new ItemMusketWithBayonet(ToolMaterial.GOLD));
		registrationList.add(DIAMOND_BAYONET_MUSKET = new ItemMusketWithBayonet(ToolMaterial.EMERALD));
		
		registrationList.add(WOODEN_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.WOOD));
		registrationList.add(STONE_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.STONE));
		registrationList.add(IRON_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.IRON));
		registrationList.add(GOLDEN_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.GOLD));
		registrationList.add(DIAMOND_BATTLE_AXE = new ItemBattleAxe(ToolMaterial.EMERALD));

		registrationList.add(WOODEN_BOOMERANG = new ItemBoomerang(ToolMaterial.WOOD));
		registrationList.add(STONE_BOOMERANG = new ItemBoomerang(ToolMaterial.STONE));
		registrationList.add(GOLDEN_BOOMERANG = new ItemBoomerang(ToolMaterial.GOLD));
		registrationList.add(IRON_BOOMERANG = new ItemBoomerang(ToolMaterial.IRON));
		registrationList.add(DIAMOND_BOOMERANG = new ItemBoomerang(ToolMaterial.EMERALD));
		
		registrationList.add(WOODEN_SABER = new ItemSaber(ToolMaterial.WOOD));
		registrationList.add(STONE_SABER = new ItemSaber(ToolMaterial.STONE));
		registrationList.add(GOLDEN_SABER = new ItemSaber(ToolMaterial.GOLD));
		registrationList.add(IRON_SABER = new ItemSaber(ToolMaterial.IRON));
		registrationList.add(DIAMOND_SABER = new ItemSaber(ToolMaterial.EMERALD));
		
		registrationList.add(WOODEN_KNIFE = new ItemKnife(ToolMaterial.WOOD));
		registrationList.add(STONE_KNIFE = new ItemKnife(ToolMaterial.STONE));
		registrationList.add(GOLDEN_KNIFE = new ItemKnife(ToolMaterial.GOLD));
		registrationList.add(IRON_KNIFE = new ItemKnife(ToolMaterial.IRON));
		registrationList.add(DIAMOND_KNIFE = new ItemKnife(ToolMaterial.EMERALD));
		
		registrationList.add(JAVELIN = new ItemJavelin());
		
		registrationList.add(MUSKET_BULLET = new ItemBulletMusket());
		
	}
	
	public static void registerItems() {
		
		//todo refactor recipe system
		for(Item item : registrationList) {
			GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		}
	}
	
	public static void registerRecipes() {
		
		for(Item item : registrationList) {
			if(item instanceof ItemExtension) {
				((ItemExtension) (item)).registerRecipes();				
			}
		}
		
		
		GameRegistry.addRecipe(new ItemStack(GUN_STOCK),
				"   ",
				"ssp",
				"   ",
				's', Items.stick,
				'p', Blocks.planks);
		
		GameRegistry.addRecipe(new ItemStack(MUSKET_BARREL),
				"   ",
				"iif",
				"  i",
				'i', Items.iron_ingot,
				'f', Items.flint_and_steel);
		
		GameRegistry.addRecipe(new ItemStack(BLUNDERBUSS_BARREL),
				"i  ",
				" if",
				"i i",
				'i', Items.iron_ingot,
				'f', Items.flint_and_steel);
	}
	
	public static void registerEntity(Class c, String name, int counter) {
		EntityRegistry.registerModEntity(c, name, counter, ReforgedMod.instance, 120, 3, true);		
	}	
	
	public static void registerEntityRenderer(Class entityclass, Render renderclass) {
		RenderingRegistry.registerEntityRenderingHandler(entityclass, renderclass);
	}
	
	public static void registerEventHandler(ReforgedEvents eventclass) {
		FMLCommonHandler.instance().bus().register(eventclass);
	    MinecraftForge.EVENT_BUS.register(eventclass);
	}
	
}
