package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Byt$Q;
import CC.$.Q$Q_LMNt.Q$Point;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import static java.lang.reflect.Array.newInstance;

public interface Byt$Point<Out_Typ> extends Byt$Q,Q$Point<Out_Typ>
{
	Clas_Rap Class=Init_StRt_Nd(Byt$Point.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	Out_Typ Byt$Point(byte In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Bytg$Pointg(byte[] From,Out_Typ[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Byt$Point(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default <Out extends Out_Typ>Out[] Bytg$Pointg(byte[] From,Class<Out> Typ)
			{
				Out[] Out=(Out[])newInstance(Typ,From.length);
				Bytg$Pointg(From,Out);

				return Out;
			}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default Out_Typ[] Bytg$Pointg(byte[] From){return Bytg$Pointg(From,Get_Out_Typ());}
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default void Bytg$Pointg(Iterable<Byte> From,Collection<Out_Typ> To){for(byte In:From){To.add(Byt$Point(In));}}
}