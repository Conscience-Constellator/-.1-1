package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.ChR$Q;
import CC.$.Q$Q_LMNt.Q$Flot;

import java.util.Collection;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;

public interface ChR$FlOt extends ChR$Q,Q$Flot
{
	Clas_Rap Class=Init_StRt_Nd(ChR$FlOt.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	float ChR$Flot(char In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Flotg(char[] From,float[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(ChR$Flot(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default float[] ChRg$Flotg(char[] In)
			{
				float[] Out=new float[In.length];
				ChRg$Flotg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void ChRg$Flotg(Iterable<Character> From,Collection<Float> To){for(char In:From){To.add(ChR$Flot(In));}}
}