package rocks.cleanstone.endpoint.minecraft.vanilla.net.packet.outbound;

import rocks.cleanstone.endpoint.minecraft.vanilla.net.packet.MinecraftOutboundPacketType;
import rocks.cleanstone.game.chat.message.Text;
import rocks.cleanstone.net.packet.PacketType;

public class DisconnectLoginPacket extends DisconnectPacket {

    public DisconnectLoginPacket(Text reason) {
        super(reason);
    }

    @Override
    public PacketType getType() {
        return MinecraftOutboundPacketType.DISCONNECT_LOGIN;
    }
}
