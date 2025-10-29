package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Long$Q;
import CC.$.Q$Q_LMNt.Q$Flot;

import java.util.Collection;

public interface Long$FlOt extends Long$Q,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(Long$FlOt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float Long$Flot(long In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Flotg(long[] From,float[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Long$Flot(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default float[] Longg$Flotg(long[] In)
			{
				float[] Out=new float[In.length];
				Longg$Flotg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Longg$Flotg(Iterable<Long> From,Collection<Float> To){for(long In:From){To.add(Long$Flot(In));}}
}