package si.bismuth.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(targets = "net.minecraft.network.NetworkSystem$4")
public class MixinNetworkSystem4 {
	@ModifyConstant(method = "initChannel", constant = @Constant(intValue = 30), remap = false)
	private int noTimeout(int value) {
		return 0;
	}
}
