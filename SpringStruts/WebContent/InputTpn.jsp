<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Price Service</title>
</head>
<body>
	<div align="center">
		<h1>Price Service</h1>
		<h2>Find Price By TPNB</h2>
		<s:form action="tpnb" method="post">
			<s:textfield label="TPNB" name="product.tpnb" />
			<s:submit value="Find" />
		</s:form>
	</div>

	<div align="left">
		<h3>
			Regular Price For TPNB :
			<s:property value="price.tpnb" />
			is
			<s:property value="price.regPrice" />
		</h3>
	</div>
</body>
</html>