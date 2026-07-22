package id.brokiem.voxelbridge.translation.impl;

import id.brokiem.voxelbridge.protocol.java.packets.play.JavaClientboundExplosionPacket;
import id.brokiem.voxelbridge.session.Session;
import id.brokiem.voxelbridge.translation.ClientboundTranslator;
import id.brokiem.voxelbridge.translation.TranslationResult;
import lombok.extern.slf4j.Slf4j;

/**
 * No-op translator for Explosion packet (0x27)
 * LCE doesn't have a direct equivalent
 */
@Slf4j
public class JavaExplosionTranslator implements ClientboundTranslator<JavaClientboundExplosionPacket> {
    @Override
    public TranslationResult translate(JavaClientboundExplosionPacket input, Session session) {
        log.debug("[Explosion] Explosion at {}, {}, {}", input.getX(), input.getY(), input.getZ());
        return TranslationResult.empty();
    }
}
