package com.spicy.mixin.mixins;

import com.spicy.utils.interfaces.IS27PacketExplosion;
import net.minecraft.network.play.server.S27PacketExplosion;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(S27PacketExplosion.class)
public abstract class MixinS27PacketExplosion implements IS27PacketExplosion {
    @Shadow
    private float field_149152_f;
    @Shadow
    private float field_149153_g;
    @Shadow
    private float field_149159_h;

    @Override
    public void setVelocityX(float velocityX) {
        field_149152_f = velocityX;
    }

    @Override
    public void setVelocityY(float velocityY) {
        field_149153_g = velocityY;
    }

    @Override
    public void setVelocityZ(float velocityZ) {
        field_149159_h = velocityZ;
    }
}