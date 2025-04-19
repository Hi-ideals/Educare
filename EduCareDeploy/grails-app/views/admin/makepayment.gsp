<%--



<a href="${paymentURL}" rel="im-checkout" data-behaviour="remote" data-style="light" data-text="Checkout With Instamojo"></a>
<script src="https://d2xwmjc4uy2hr5.cloudfront.net/im-embed/im-embed.min.js"></script>--%>



<p>Please Wait.. We're Redirecting You To Payment Gateway</p>
<form action="${paymentURL}" >
    <input id="pay1" rel="im-checkout" data-behaviour="remote" data-style="light" data-text="Checkout With Instamojo"  type="submit"  style="display: none" />
</form>

<script type="text/javascript">
document.getElementById('pay1').click();
</script>