class LazyProperty(val initializer: () -> Int) {
    var value: Int? = null
    val lazy: Int
        get() {

            return value ?: initializer().apply {
                value = this
            }
        }
}
