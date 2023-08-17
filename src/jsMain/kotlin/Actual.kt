actual sealed class RenderEffect actual constructor() {
    actual open fun isSupported(): Boolean = true

    // No extra fun createImageFilter which is declared in jvmMain actual
}

actual class BlurEffect actual constructor(
    renderEffect: RenderEffect?,
    radiusX: Float,
    radiusY: Float,
) : RenderEffect() {
    actual override fun isSupported(): Boolean {
        return super.isSupported()
    }
}