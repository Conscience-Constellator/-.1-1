package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$Short;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl$Short extends Dubl$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short Dubl$Short(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Shortg(double[] From,short[] To){for(int Indx=0;Indx<From.length;Indx+=1){To[Indx]=(Dubl$Short(From[Indx]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default short[] Dublg$Shortg(double[] In)
			{
				short[] Out=new short[In.length];
				Dublg$Shortg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Shortg(Iterable<Double> From,Collection<Short> To){for(double In:From){To.add(Dubl$Short(In));}}
}