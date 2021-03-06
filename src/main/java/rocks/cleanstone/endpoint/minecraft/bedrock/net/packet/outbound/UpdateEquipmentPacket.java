package rocks.cleanstone.endpoint.minecraft.bedrock.net.packet.outbound;

import com.github.steveice10.opennbt.tag.builtin.Tag;
import rocks.cleanstone.endpoint.minecraft.bedrock.net.packet.BedrockOutboundPacketType;
import rocks.cleanstone.net.packet.Packet;
import rocks.cleanstone.net.packet.PacketType;

public class UpdateEquipmentPacket implements Packet {

    private final byte windowID;
    private final byte windowType;
    private final byte unknown;
    private final long entityID;
    private final Tag namedTag;

    public UpdateEquipmentPacket(byte windowID, byte windowType, byte unknown, long entityID, Tag namedTag) {
        this.windowID = windowID;
        this.windowType = windowType;
        this.unknown = unknown;
        this.entityID = entityID;
        this.namedTag = namedTag;
    }

    public byte getWindowID() {
        return windowID;
    }

    public byte getWindowType() {
        return windowType;
    }

    public byte getUnknown() {
        return unknown;
    }

    public long getEntityID() {
        return entityID;
    }

    public Tag getNamedTag() {
        return namedTag;
    }

    @Override
    public PacketType getType() {
        return BedrockOutboundPacketType.UPDATE_EQUIPMENT;
    }
}

