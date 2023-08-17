actual sealed class RenderEffect actual constructor() {
    actual open fun isSupported(): Boolean = true

    protected abstract fun createImageFilter(): Any?
}

actual class BlurEffect actual constructor(
    renderEffect: RenderEffect?,
    radiusX: Float,
    radiusY: Float,
) : RenderEffect() {

    override fun createImageFilter(): Any? = null
}