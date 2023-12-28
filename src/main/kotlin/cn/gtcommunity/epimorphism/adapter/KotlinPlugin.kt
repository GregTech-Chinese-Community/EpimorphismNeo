package cn.gtcommunity.epimorphism.adapter

import cn.gtcommunity.epimorphism.Tags
import net.minecraftforge.common.ForgeVersion
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin

@IFMLLoadingPlugin.Name("KotlinLoadingPlugin")
@IFMLLoadingPlugin.MCVersion(ForgeVersion.mcVersion)
@IFMLLoadingPlugin.TransformerExclusions(Tags.PACKAGE + Tags.MOD_ID + "adapter")
class KotlinPlugin: IFMLLoadingPlugin {
    companion object {
        const val ADAPTER = Tags.PACKAGE + Tags.MOD_ID + "adapter.KotlinAdapter"
    }

    override fun getASMTransformerClass(): Array<String?> = arrayOfNulls(0)

    override fun getModContainerClass() = null

    override fun getSetupClass() = Tags.PACKAGE + Tags.MOD_ID + ".adapter.KotlinCallHook"

    override fun injectData(data: MutableMap<String, Any>?) {}

    override fun getAccessTransformerClass() = null

}