package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$Long;

import java.util.Collection;

public interface Dubl$Long extends Dubl$Q,Q$Long
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$Long.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	long Dubl$Long(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Longg(double[] From,long[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Dubl$Long(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default long[] Dublg$Longg(double[] In)
			{
				long[] Out=new long[In.length];
				Dublg$Longg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Longg(Iterable<Double> From,Collection<Long> To){for(double In:From){To.add(Dubl$Long(In));}}
}