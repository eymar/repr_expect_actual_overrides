expect sealed class RenderEffect() {
    open fun isSupported(): Boolean
}

expect class BlurEffect(
    renderEffect: RenderEffect?,
    radiusX: Float,
    radiusY: Float = radiusX,
) : RenderEffect {
    override fun isSupported(): Boolean
}

fun main() {
    println(BlurEffect(null, 10f, 10f))
}