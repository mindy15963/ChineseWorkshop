package cityofskytcd.chineseworkshop.crafting;

public class CraftingLoader {
	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
	}

	private static void registerRecipe() {
		// /* 方块 */
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackBrickWall),
		// new Object[] { "##", "##", '#', ItemRegistry.blackBrick });
		// GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.redPillars, 2),
		// new Object[] { Items.CLAY_BALL, Blocks.LOG, new ItemStack(Items.DYE, 1, 1),
		// Items.CLAY_BALL });
		// GameRegistry.addShapelessRecipe(new ItemStack(BlockRegistry.darkGreenPillars,
		// 2),
		// new Object[] { Items.CLAY_BALL, Blocks.LOG, new ItemStack(Items.DYE, 1, 2),
		// Items.CLAY_BALL });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.whiteGrayWalls, 4),
		// new Object[] { "**", "*#", '#', Blocks.SAND, '*', Items.QUARTZ });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.whiteGrayWalls, 2),
		// new Object[] { "**", "*#", '#', Blocks.SAND, '*', new ItemStack(Items.DYE, 1,
		// 15) });
		// /* 灯 */
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.stoneTowerLamp, 3),
		// new Object[] { " * ", "*@*", "#!#",
		// '#', Blocks.STONE, '*', Blocks.STONEBRICK, '@', Blocks.REDSTONE_LAMP, '!',
		// Blocks.REDSTONE_TORCH });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.theLantern, 6), new
		// Object[] { "#*#", "#!#", "#*#", '#',
		// new ItemStack(Blocks.WOOL, 1, 14), '*', new ItemStack(Blocks.WOOL, 1, 4),
		// '!', Blocks.TORCH });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.candle, 6),
		// new Object[] { " #", " **", "* ", '#', Blocks.TORCH, '*', Items.IRON_INGOT
		// });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.whiteLanterns, 2),
		// new Object[] { "***", "#!#", "***", '#', Items.STICK, '*', Items.PAPER, '!',
		// Blocks.TORCH });
		// /* 材料 */
		// GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.blackClay, 8),
		// new Object[] { "###", "#*#", "###", '#', Items.CLAY_BALL, '*', Items.DYE });
		// /* 装饰 */
		//
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.bracketSet),
		// new Object[] { "###", "###", " # ", '#', Items.STICK });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoof, 16),
		// new Object[] { " #", " ##", "###", '#', ItemRegistry.blackBrick });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoof, 16),
		// new Object[] { "# ", "## ", "###", '#', ItemRegistry.blackBrick });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.carving, 3),
		// new Object[] { "###", "###", '#', Items.STICK });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.menDun, 4), new
		// Object[] { " **", " **", "###", '#',
		// new ItemStack(Blocks.STONE_SLAB, 1, 0), '*', Blocks.STONEBRICK });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.doorThreshold, 3),
		// new Object[] { "###", '#', new ItemStack(Blocks.STONE_SLAB, 1, 0) });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRidgeRoof,
		// 16),
		// new Object[] { "###", "###", '#', ItemRegistry.blackBrick });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRidgeRoofL,
		// 5),
		// new Object[] { "# ", "# ", "###", '#', BlockRegistry.blackTileRidgeRoof });
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRidgeRoofEdge, 3),
		// new Object[] { "#", "#", "#", '#', BlockRegistry.blackTileRidgeRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRidgeRoofT,
		// 4),
		// new Object[] { "###", " # ", '#', BlockRegistry.blackTileRidgeRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRidgeRoofX,
		// 5),
		// new Object[] { "# #", " # ", "# #", '#', BlockRegistry.blackTileRidgeRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRidgeRoofJ,
		// 3),
		// new Object[] { "# ", " # ", " #", '#', BlockRegistry.blackTileRidgeRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoofj, 3),
		// new Object[] { "# ", " # ", " #", '#', BlockRegistry.blackTileRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.thinWhiteGrayWalls,
		// 18),
		// new Object[] { "#", "#", "#", '#', BlockRegistry.whiteGrayWalls });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoofEdgeZ,
		// 6),
		// new Object[] { " #", "#*", '#', BlockRegistry.whiteGrayWalls, '*',
		// BlockRegistry.blackTileRoof });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoofEdgeY,
		// 6),
		// new Object[] { "# ", "*#", '*', BlockRegistry.whiteGrayWalls, '#',
		// BlockRegistry.blackTileRoof });
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeYJ, 1),
		// new Object[] { ItemRegistry.blackBrick, BlockRegistry.blackTileRoofEdgeY });
		// GameRegistry.addShapelessRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeZJ, 1),
		// new Object[] { ItemRegistry.blackBrick, BlockRegistry.blackTileRoofEdgeZ });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.treeAltar, 2),
		// new Object[] { "*#*", '#', Blocks.LOG, '*', BlockRegistry.blackBrickWall });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.bench, 1),
		// new Object[] { "###", "***", "* *", '#', Blocks.WOODEN_SLAB, '*', Items.STICK
		// });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.table, 4),
		// new Object[] { "###", "* *", "* *", '#', Blocks.WOODEN_SLAB, '*',
		// Blocks.PLANKS });
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.andesitePavement,
		// 2),
		// new Object[] { "#*", "*#", '#', new ItemStack(Blocks.STONE, 1, 6), '*',
		// ItemRegistry.blackBrick });
		// // 白灰墙阶梯
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.whiteGrayWallsStairs, 6),
		// new Object[] { "# ", "## ", "###", '#', BlockRegistry.whiteGrayWalls });
		// // 纸窗
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.paperWindow, 4),
		// new Object[] { "#*#", "#*#", '#', Items.STICK, '*', Items.PAPER });
		// // 闪长岩栅栏
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.dioriteFence, 6),
		// new Object[] { "###", "###", '#', new ItemStack(Blocks.STONE, 1, 3) });
		// // 小黑砖墙
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.smallBlackBrickWall,
		// 6),
		// new Object[] { "###", "###", '#', BlockRegistry.blackBrickWall });
		// // 小白灰墙
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.smallWhiteGrayWalls,
		// 6),
		// new Object[] { "###", "###", '#', BlockRegistry.whiteGrayWalls });
		// // 橡木中式栅栏
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.oakChineseFence,
		// 10), new Object[] { "#*#", "#*#", '#',
		// new ItemStack(Blocks.LOG, 1, 0), '*', new ItemStack(Blocks.PLANKS, 1, 0) });
		// // 安山岩栅栏
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.andesiteFence, 6),
		// new Object[] { "###", "###", '#', new ItemStack(Blocks.STONE, 1, 5) });
		// // 挂落
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.implicate, 10),
		// new Object[] { "#*#", "#*#", '*', new ItemStack(Blocks.LOG, 1, 0), '#',
		// Items.STICK });
		// // 安山岩路面楼梯
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.andesitePavementStairs, 6),
		// new Object[] { "# ", "## ", "###", '#', BlockRegistry.andesitePavement });
		// // 橡木墙
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.oakWall, 9),
		// new Object[] { "###", "###", "###", '#', new ItemStack(Blocks.PLANKS, 1, 0)
		// });
		// // 中式木门
		// GameRegistry.addShapedRecipe(new ItemStack(ItemRegistry.cwDoor, 1),
		// new Object[] { "#*", '#', Items.SPRUCE_DOOR, '*', Blocks.PLANKS });
		//
		// /* 屋顶 */
		// // 黑瓦屋顶半砖
		// GameRegistry.addShapedRecipe(new ItemStack(BlockRegistry.blackTileRoofSlab,
		// 6),
		// new Object[] { "###", '#', BlockRegistry.blackTileRoof });
		// // 黑瓦屋顶半砖top
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofSlabTop, 12),
		// new Object[] { "###", "###", '#', BlockRegistry.blackTileRoof });
		// // 黑瓦屋脊top
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRidgeRoofTop, 3),
		// new Object[] { "###", '#', BlockRegistry.blackTileRidgeRoof });
		// /* 薄墙 */
		// // 黑瓦屋顶半砖边缘左
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeSlabZ, 4),
		// new Object[] { "##", '#', BlockRegistry.blackTileRoofEdgeZ });
		// // 黑瓦屋顶半砖边缘左TOP
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeSlabTopZ, 6),
		// new Object[] { "###", '#', BlockRegistry.blackTileRoofEdgeZ });
		// // 黑瓦屋顶半砖边缘右
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeSlabY, 4),
		// new Object[] { "##", '#', BlockRegistry.blackTileRoofEdgeY });
		// // 黑瓦屋顶半砖边缘右TOP
		// GameRegistry.addShapedRecipe(new
		// ItemStack(BlockRegistry.blackTileRoofEdgeSlabTopY, 6),
		// new Object[] { "###", '#', BlockRegistry.blackTileRoofEdgeY });
	}

	private static void registerSmelting() {
		// /* 装饰 */
		// GameRegistry.addSmelting(ItemRegistry.blackClay, new
		// ItemStack(ItemRegistry.blackBrick), 0.5F);
	}

	private static void registerFuel() {

	}
}