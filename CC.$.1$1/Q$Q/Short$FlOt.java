package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Q$Flot;
import CC.$.Q$Q_LMNt.Short$Q;

import java.util.Collection;

public interface Short$FlOt extends Short$Q,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(Short$FlOt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float Short$Flot(short In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Flotg(short[] From,float[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Short$Flot(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default float[] Shortg$Flotg(short[] In)
			{
				float[] Out=new float[In.length];
				Shortg$Flotg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Shortg$Flotg(Iterable<Short> From,Collection<Float> To){for(short In:From){To.add(Short$Flot(In));}}
}