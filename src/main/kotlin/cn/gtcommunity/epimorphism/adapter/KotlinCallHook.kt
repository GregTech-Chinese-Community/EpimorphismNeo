package cn.gtcommunity.epimorphism.adapter

import net.minecraftforge.fml.relauncher.IFMLCallHook

@Suppress("unused")
class KotlinCallHook: IFMLCallHook {
    override fun injectData(data: Map<String?, Any?>?) {
        val loader = data?.get("classLoader") as ClassLoader?
        try {
            loader?.loadClass(KotlinPlugin.ADAPTER)
        } catch (e: ClassNotFoundException) {
            throw RuntimeException("Couldn't find Kotlin language adapter!")
        }
    }

    override fun call() = null
}