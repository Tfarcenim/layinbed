package tfar.layinbed.mixin;

import tfar.layinbed.LayInBed;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Minecraft.class)
public class MixinMinecraft {
    
    @Inject(at = @At("TAIL"), method = "<init>")
    private void init(CallbackInfo info) {
        
        LayInBed.LOG.info("This line is printed by an example mod common mixin!");
        LayInBed.LOG.info("MC Version: {}", Minecraft.getInstance().getVersionType());
    }
}