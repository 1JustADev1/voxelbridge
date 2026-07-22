package id.brokiem.voxelbridge.translation.impl;

import id.brokiem.voxelbridge.protocol.java.packets.play.JavaClientboundMultiBlockChangePacket;
import id.brokiem.voxelbridge.session.Session;
import id.brokiem.voxelbridge.translation.ClientboundTranslator;
import id.brokiem.voxelbridge.translation.TranslationResult;
import lombok.extern.slf4j.Slf4j;

/**
 * No-op translator for Multi Block Change packet (0x22)
 * LCE uses individual block change packets instead
 */
@Slf4j
public class JavaMultiBlockChangeTranslator implements ClientboundTranslator<JavaClientboundMultiBlockChangePacket> {
    @Override
    public TranslationResult translate(JavaClientboundMultiBlockChangePacket input, Session session) {
        // Multi block changes are not directly supported in LCE
        // The individual block changes should be handled by individual packets
        return TranslationResult.empty();
    }
}
