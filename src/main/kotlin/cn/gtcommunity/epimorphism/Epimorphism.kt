package cn.gtcommunity.epimorphism

import cn.gtcommunity.epimorphism.adapter.KotlinPlugin
import net.minecraftforge.fml.common.Mod

@Mod(
    modid = Tags.MOD_ID,
    name = Tags.MOD_NAME,
    version = Tags.VERSION,
    modLanguage = "kotlin",
    modLanguageAdapter = KotlinPlugin.ADAPTER
)
object Epimorphism {
}