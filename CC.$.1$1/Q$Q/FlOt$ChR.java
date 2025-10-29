package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Flot$Q;
import CC.$.Q$Q_LMNt.Q$ChR;
import java.util.Collection;

public interface FlOt$ChR extends Flot$Q,Q$ChR
{
	Clas_Rap Class=Init_StRt_Nd(FlOt$ChR.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	char Flot$ChR(float In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg$ChRg(float[] From,char[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Flot$ChR(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default char[] Flotg$ChRg(float[] In)
			{
				char[] Out=new char[In.length];
				Flotg$ChRg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg$ChRg(Iterable<Float> From,Collection<Character> To){for(float In:From){To.add(Flot$ChR(In));}}
}