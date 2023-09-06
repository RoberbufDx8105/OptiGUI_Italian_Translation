package opekope2.optigui.properties.impl

import opekope2.optigui.properties.ICommonProperties
import opekope2.optigui.properties.IDonkeyProperties
import opekope2.optigui.properties.IHorseLikeProperties
import java.util.function.BiConsumer

/**
 * Implementation of [IDonkeyProperties] for donkeys.
 */
data class DonkeyProperties(
    val commonProperties: ICommonProperties,
    val horseLikeProperties: IHorseLikeProperties,
    override val hasChest: Boolean,
) : ICommonProperties by commonProperties, IHorseLikeProperties by horseLikeProperties, IDonkeyProperties {
    override fun writeSelectors(appendSelector: BiConsumer<String, String>) {
        super<ICommonProperties>.writeSelectors(appendSelector)
        super<IDonkeyProperties>.writeSelectors(appendSelector)
    }
}
