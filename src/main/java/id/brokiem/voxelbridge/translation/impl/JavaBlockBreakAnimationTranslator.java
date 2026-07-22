package id.brokiem.voxelbridge.translation.impl;

import id.brokiem.voxelbridge.protocol.java.packets.play.JavaClientboundBlockBreakAnimationPacket;
import id.brokiem.voxelbridge.session.Session;
import id.brokiem.voxelbridge.translation.ClientboundTranslator;
import id.brokiem.voxelbridge.translation.TranslationResult;
import lombok.extern.slf4j.Slf4j;

/**
 * No-op translator for Block Break Animation packet (0x35)
 * LCE doesn't have a direct equivalent, so we silently drop this packet
 */
@Slf4j
public class JavaBlockBreakAnimationTranslator implements ClientboundTranslator<JavaClientboundBlockBreakAnimationPacket> {
    @Override
    public TranslationResult translate(JavaClientboundBlockBreakAnimationPacket input, Session session) {
        // Block break animations are not supported in LCE, silently ignore
        return TranslationResult.empty();
    }
}
