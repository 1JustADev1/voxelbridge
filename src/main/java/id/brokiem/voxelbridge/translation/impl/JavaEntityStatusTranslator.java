package id.brokiem.voxelbridge.translation.impl;

import id.brokiem.voxelbridge.protocol.java.packets.play.JavaClientboundEntityStatusPacket;
import id.brokiem.voxelbridge.session.Session;
import id.brokiem.voxelbridge.translation.ClientboundTranslator;
import id.brokiem.voxelbridge.translation.TranslationResult;
import lombok.extern.slf4j.Slf4j;

/**
 * Translator for Entity Status packet (0x1A)
 * Handles entity events like damage, death, etc.
 * For now, we'll log it but not translate
 */
@Slf4j
public class JavaEntityStatusTranslator implements ClientboundTranslator<JavaClientboundEntityStatusPacket> {
    @Override
    public TranslationResult translate(JavaClientboundEntityStatusPacket input, Session session) {
        log.debug("[Entity Status] Entity {} status {}", input.getEntityId(), input.getStatus());
        return TranslationResult.empty();
    }
}
