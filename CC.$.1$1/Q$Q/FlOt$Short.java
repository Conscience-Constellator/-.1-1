package CC.$.Q$Q;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_StRt_Nd;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Lin_Dclar;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.$.Q$Q_LMNt.Flot$Q;
import CC.$.Q$Q_LMNt.Q$Short;
import java.util.Collection;

public interface FlOt$Short extends Flot$Q,Q$Short
{
	Clas_Rap Class=Init_StRt_Nd(FlOt$Short.class
		,Clas_Rap.class
	);/*Dep ?done*/

	@Lin_Dclar
	short Flot$Short(float In);
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg$Shortg(float[] From,short[] To){for(int IndX=0;IndX<From.length;IndX+=1){To[IndX]=(Flot$Short(From[IndX]));}}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default short[] Flotg$Shortg(float[] In)
			{
				short[] Out=new short[In.length];
				Flotg$Shortg(In,Out);

				return Out;
			}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Flotg$Shortg(Iterable<Float> From,Collection<Short> To){for(float In:From){To.add(Flot$Short(In));}}
}