package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Dubl$Q;
import CC.$.Q$Q_LMNt.Q$Flot;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface Dubl$FlOt extends Dubl$Q,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(Dubl$FlOt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float Dubl$Flot(double In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Flotg(double[] From,float[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Dubl$Flot(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default float[] Dublg$Flotg(double[] In)
			{
				float[] Out=new float[In.length];
				Dublg$Flotg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Dublg$Flotg(Iterable<Double> From,Collection<Float> To){for(double In:From){To.add(Dubl$Flot(In));}}
}