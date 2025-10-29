package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Flot$Q;
import CC.$.Q$Q_LMNt.Q$Long;
import java.util.Collection;

public interface FlOt$Long extends Flot$Q,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(FlOt$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long Flot$Long(float In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flot$Long(float[] From,long[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Flot$Long(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default long[] Flot$Long(float[] In)
			{
				long[] Out=new long[In.length];
				Flot$Long(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flot$Long(Iterable<Float> From,Collection<Long> To){for(float In:From){To.add(Flot$Long(In));}}
}