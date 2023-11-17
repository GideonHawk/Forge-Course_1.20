package net.gideon.mccourse.item;

import net.gideon.mccourse.MCCourseMod;
import net.gideon.mccourse.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MCCourseMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COURSE_TAB = CREATIVE_MODE_TAB.register("course_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.course_tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModItems.ALEXANDRITE.get());
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.END_STONE_ALEXANDRITE_ORE.get());
                        output.accept(ModBlocks.NETHER_ALEXANDRITE_ORE.get());



                    }).build());
 public static final RegistryObject<CreativeModeTab> COURSE_TAB_2 = CREATIVE_MODE_TAB.register("course_tab_2",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RAW_ALEXANDRITE.get()))
                    .title(Component.translatable("creativetab.course_tab_2"))
                    .displayItems((displayParameters, output) -> {
                        //output.accept(ModItems.ALEXANDRITE.get()); // this item will not be included in the second creative mod tab just to show the difference between the two
                        output.accept(ModItems.RAW_ALEXANDRITE.get());

                        output.accept(ModBlocks.ALEXANDRITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_ALEXANDRITE_BLOCK.get());


                    }).build());


    public static void register(IEventBus eventbus){
        CREATIVE_MODE_TAB.register(eventbus);
    }

}
