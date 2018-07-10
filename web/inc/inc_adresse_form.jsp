<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<tbody>
    <tr><td>
<label for="ligne1Adresse">Adresse ligne 1 <span class="requis">*</span></label>
<input type="text" id="ligne1Adresse" name="ligne1Adresse" value="<c:out value="${adresse.ligne1}"/>" size="30" maxlength="50" />
<span class="erreur">${form.erreurs['ligne1Adresse']}</span>
        </td></tr>
 <tr><td>    
<label for="ligne2Adresse">Adresse ligne 2 &nbsp</label>
<input type="text" id="ligne2Adresse" name="ligne2Adresse" value="<c:out value="${adresse.ligne2}"/>" size="30" maxlength="50" />
<span class="erreur">${form.erreurs['ligne2Adresse']}</span>
 </td></tr>
 <tr><td>
<label for="cpAdresse">Code Postal <span class="requis">*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
<input type="text" id="cpAdresse" name="cpAdresse" value="<c:out value="${adresse.cp}"/>" size="5" maxlength="5" />
<span class="erreur">${form.erreurs['cpAdresse']}</span>
 </td></tr>
 <tr><td>
<label for="villeAdresse">Ville <span class="requis">*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
<input type="text" id="villeAdresse" name="villeAdresse" value="<c:out value="${adresse.ville}"/>" size="30" maxlength="50" />
<span class="erreur">${form.erreurs['villeAdresse']}</span>
 </td></tr>
 <tr><td>
<label for="paysAdresse">Pays <span class="requis">*</span>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
<input type="text" id="paysAdresse" name="paysAdresse" value="<c:out value="${adresse.pays}"/>" size="30" maxlength="50" />
<span class="erreur">${form.erreurs['paysAdresse']}</span> </td></tr>