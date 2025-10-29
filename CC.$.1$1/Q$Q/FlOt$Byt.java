package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Flot$Q;
import CC.$.Q$Q_LMNt.Q$Byt;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface FlOt$Byt extends Flot$Q,Q$Byt
{
	Clas_Rap Class=Init_StRt_Nd(FlOt$Byt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	byte Flot$Byt(float In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flot$Byt(float[] From,byte[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Flot$Byt(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default byte[] Flot$Byt(float[] In)
			{
				byte[] Out=new byte[In.length];
				Flot$Byt(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flot$Byt(Iterable<Float> From,Collection<Byte> To){for(float In:From){To.add(Flot$Byt(In));}}
}