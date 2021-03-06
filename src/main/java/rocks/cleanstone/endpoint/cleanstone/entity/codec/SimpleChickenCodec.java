package rocks.cleanstone.endpoint.cleanstone.entity.codec;

import io.netty.buffer.ByteBuf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rocks.cleanstone.data.InOutCodec;
import rocks.cleanstone.endpoint.cleanstone.entity.types.SimpleChicken;
import rocks.cleanstone.game.entity.LivingEntity;
import rocks.cleanstone.storage.entity.LivingEntityCodec;

import java.io.IOException;

@Component
public class SimpleChickenCodec implements InOutCodec<SimpleChicken, ByteBuf> {

    private final LivingEntityCodec livingEntityCodec;

    @Autowired
    public SimpleChickenCodec(LivingEntityCodec livingEntityCodec) {
        this.livingEntityCodec = livingEntityCodec;
    }

    @Override
    public SimpleChicken decode(ByteBuf data) throws IOException {
        LivingEntity livingEntity = livingEntityCodec.decode(data);
        // TODO read custom chicken properties
        return new SimpleChicken(livingEntity.getWorld(), livingEntity.getPosition(),
                livingEntity.isGlowing(), livingEntity.getHealth());
    }

    @Override
    public ByteBuf encode(SimpleChicken chicken) throws IOException {
        ByteBuf data = livingEntityCodec.encode(chicken);
        // TODO write custom chicken properties
        return data;
    }
}
