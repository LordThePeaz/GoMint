package io.gomint.server.network.packet;

import io.gomint.jraknet.PacketBuffer;
import io.gomint.server.network.Protocol;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class PacketSetTitle extends Packet {

    @Getter@Setter
    private int type;
    @Getter@Setter
    private String text = "";
    @Getter@Setter
    private int fadeInTime = 0;
    @Getter@Setter
    private int stayTime = 0;
    @Getter@Setter
    private int fadeOutTime = 0;

    public PacketSetTitle() {
        super( Protocol.PACKET_SET_TITLE );
    }

    @Override
    public void serialize( PacketBuffer buffer ) {
        buffer.writeSignedVarInt( type );
        buffer.writeString( text );
        buffer.writeSignedVarInt( fadeInTime );
        buffer.writeSignedVarInt( stayTime);
        buffer.writeSignedVarInt( fadeOutTime );
    }

    @Override
    public void deserialize( PacketBuffer buffer ) {
        this.type = buffer.readSignedVarInt();
        this.text = buffer.readString();
        this.fadeInTime = buffer.readSignedVarInt();
        this.stayTime = buffer.readSignedVarInt();
        this.fadeOutTime = buffer.readSignedVarInt();
    }

    public enum TitleType {

        TYPE_CLEAR( 0 ),
        TYPE_RESET( 1 ),
        TYPE_TITLE( 2 ),
        TYPE_SUBTITLE( 3 ),
        TYPE_ACTION_BAR( 4 ),
        TYPE_ANIMATION_TIMES( 5 );

        @Getter
        private final int id;

        TitleType( int id ) {
            this.id = id;
        }

    }
}
